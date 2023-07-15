package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Asset;


public interface AssetService {
	public List<Asset> getAsset();
	public Asset getAsset(long userID);
//	public Asset getUsersByUsers(String user);
	public Asset addAsset(Asset asset);
	public Asset UpdateAsset(Asset asset);
	public void deleteAsset(long assetID);
}
