package com.springrest.springrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Asset;
import com.springrest.springrest.service.AssetService;

@RestController
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	
	
		// Get Assets
		@GetMapping("/assets")
		public List<Asset> getUsers()
		{
			return this.assetService.getAsset();
		}
		
		// Add Assets
		@PostMapping("/assets")
		public Asset addAsset(@RequestBody Asset asset) {
			return this.assetService.addAsset(asset);
		}
		
		// Update Assets
		@PutMapping("/assets")
		public Asset UpdateUser(@RequestBody Asset asset) {
			return this.assetService.UpdateAsset(asset);
		}
		
		// Delete Asset
		@DeleteMapping("/assets/{assetsID}")
		public ResponseEntity<HttpStatus> deleteUser(@PathVariable String assetsID){
			try {
				this.assetService.deleteAsset(Long.parseLong(assetsID));
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		

}
