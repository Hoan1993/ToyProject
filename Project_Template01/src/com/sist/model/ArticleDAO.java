package com.sist.model;

import java.sql.*;
import javax.naming.InitialContext;
import util.DBManager;

public class ArticleDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";
	
	private ArticleDAO() {
		// TODO Auto-generated constructor stub
	}
	
	private static ArticleDAO instance = new ArticleDAO();
	
	public static ArticleDAO getInstance() {
		return instance;
	}
	
	public ArticleVO articleCont(int article_no) {
			ArticleVO vo = new ArticleVO();
		
		try {
			conn = DBManager.openConn();
			sql = "select * from article0 where article_no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {	
				vo.setArticle_writer(rs.getString("article_writer"));
				vo.setArticle_name(rs.getString("article_name"));
				vo.setArticle_media(rs.getString("article_media"));
				vo.setArticle_gen1(rs.getString("article_gen1"));
				vo.setArticle_gen2(rs.getString("article_gen2"));
				vo.setArticle_title(rs.getString("article_title"));
				vo.setArticle_cont(rs.getString("article_cont"));
				vo.setArticle_file1(rs.getString("article_file1"));
				vo.setArticle_file1(rs.getString("article_file1"));
				vo.setArticle_file1(rs.getString("article_file1"));
				vo.setArticle_file1(rs.getString("article_file1"));
				vo.setArticle_date(rs.getString("article_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}

		return vo;
	}

	public int articleHit(int article_no) {
		int result = 0;
			
		try {
			conn = DBManager.openConn(); // 조회수 증가
			sql = "update article0 set article_hit=+1 where article_no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article_no);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		
		return result;
	}
}
