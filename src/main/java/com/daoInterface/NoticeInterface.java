package com.daoInterface;

import java.sql.SQLException;
import java.util.List;

import com.Model.Notices;
import com.Model.Services;

public interface NoticeInterface {
	public boolean addNotice(Notices notice) throws SQLException, ClassNotFoundException;
	public List<Notices> getNoticeByRole(String role) throws SQLException, ClassNotFoundException;
	public List<Notices> getAllNotices() throws SQLException, ClassNotFoundException;
	public boolean deleteNotice(String noticeId) throws SQLException, ClassNotFoundException ;
	public boolean updateNotice(String userId, String columnToUpdate, String newValue)throws SQLException, ClassNotFoundException ;

	}