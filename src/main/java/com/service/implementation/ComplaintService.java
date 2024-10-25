package com.service.implementation;

import java.sql.SQLException;
import java.util.List;

import com.Model.Complaint;
import com.dao.implementation.ComplaintDAO;
import com.daoInterface.ComplaintInterface;
import com.serviceInterface.ComplaintServiceInterface;

public class ComplaintService  implements ComplaintServiceInterface{
	private ComplaintInterface complaintDAO = new ComplaintDAO();

	public void addComplaint(Complaint complaint) throws SQLException, ClassNotFoundException {
		complaintDAO.addComplaint(complaint);
	}

	public List<Complaint> getComplaintsById(String userId) throws SQLException, ClassNotFoundException {
		return complaintDAO.getComplaintById(userId);
	}

	public List<Complaint> listComplaints() throws SQLException, ClassNotFoundException {
		return complaintDAO.getAllComplaints();
	}

	public void deleteComplaint(String idComplaint) throws SQLException, ClassNotFoundException {
		complaintDAO.deleteComplaint(idComplaint);
	}

	public void updateComplaint(String idComplaint, String ColumnToUpdate, String NewValue)
			throws SQLException, ClassNotFoundException {
		complaintDAO.updateComplaint(idComplaint, ColumnToUpdate, NewValue);
	}
}
