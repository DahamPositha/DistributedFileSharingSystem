package com.filesharing.actionManagersImp;

import com.filesharing.actionManagers.RoutingTableManager;
import com.filesharing.dtos.TableRecord;
import com.filesharing.globalitems.RoutingTable;

public class RoutingTableManagerImp implements RoutingTableManager {
	
	@Override
	public void storeRoutingData(String server, int port, String userName) {
		TableRecord tr = new TableRecord(server, port, userName);
		RoutingTable.getInstance().getRecords().put(server, tr);
		System.out.println("Routing Table Size : " + RoutingTable.getInstance().getRecords().size());
	}

	@Override
	public void removeRoutingData(String server, int port, String userName) {
		RoutingTable.getInstance().getRecords().remove(server);
		System.out.println("Routing Table Size : " + RoutingTable.getInstance().getRecords().size());
	}

	@Override
	public void resetRoutingTable() {
		RoutingTable.getInstance().getRecords().clear();
		System.out.println("Routing Table Cleared");
	}
	
}
