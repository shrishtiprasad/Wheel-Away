package dao;

import java.util.List;

import bean.BusInfo;
import bean.User;
import exception.BusNotFoundException;
import exception.InsufficientTicketException;
import exception.UserNotFoundException;

public interface BusTicketDao {

	public String loginAdmin(String username,String password) throws UserNotFoundException;
	public List<BusInfo> prvoidebusdetails() throws BusNotFoundException;
	public String confirmTheSeat(User user) throws InsufficientTicketException;

}