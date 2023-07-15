package com.springrest.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.AssetDao;
import com.springrest.springrest.entities.Asset;

@Service
public class AssetServiceIMPL implements AssetService{
	@Autowired
	private AssetDao assetDao;
	
	@Override
	public List<Asset> getAsset() {
		return assetDao.findAll();
	}

	@Override
	public Asset getAsset(long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asset addAsset(Asset asset) {
		assetDao.save(asset);
		return asset;
	}

	@Override
	public Asset UpdateAsset(Asset asset) {
		assetDao.save(asset);
		return asset;
	}

	@Override
	public void deleteAsset(long assetID) {
		Asset entity = assetDao.getOne(assetID);
		assetDao.delete(entity);
		
	}

}
