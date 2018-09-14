package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;
public class BuyItemDAO{

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	public BuyItemDTO getBuyItemInfo() {
	String sql = "SELECT id, item_name, item_price FROM item_info_transaction";
	try {
	PreparedStatement preparedStatement = connection.prepareStatement(sql);
	ResultSet resultSet = preparedStatement.executeQuery();

	if(resultSet.next()) {
	buyItemDTO.setId(resultSet.getInt("id"));
	buyItemDTO.setItemName(resultSet.getString("item_name"));
	buyItemDTO.setItemPrice(resultSet.getString("item_price"));
	}
	} catch(Exception e) {
	e.printStackTrace();
	}
	return buyItemDTO;
	}
	public BuyItemDTO getBuyItemDTO() {
	return buyItemDTO;
	}
	public void buyItemeInfo(String string, String string2, String string3, String string4, String string5) {
		// TODO 自動生成されたメソッド・スタブ

	}
	}
