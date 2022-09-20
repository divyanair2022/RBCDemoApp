/**
 * 
 */
package com.rbc.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rbc.stock.model.DowJonesIndex;
import com.rbc.stock.model.FileDetail;
import com.rbc.stock.model.UploadResponse;
import com.rbc.stock.service.DowJonesIndexService;

/**
 * @author divya
 *
 */
@RestController
public class DowJonesIndexController {
	
	@Autowired
	private DowJonesIndexService dowJonesIndexService;	
			
	@PostMapping("/dowJonesIndex")         
    public ResponseEntity<UploadResponse> uploadDowJonesIndex(@RequestBody FileDetail fileDetail) {		
		String status = dowJonesIndexService.saveDowJonesIndex(fileDetail);
		UploadResponse response = new UploadResponse();
		response.setStatus(status);
		return new ResponseEntity<>(response, HttpStatus.OK);
		
    }
	
	@PostMapping("/dowJonesIndex/newDowjonesRecord")
	public DowJonesIndex addDowJonesRecord(@RequestBody DowJonesIndex dowJonesIndex) {
		return dowJonesIndexService.addNewDowJonesRecord(dowJonesIndex);
	}
	
	@GetMapping("/dowJonesIndex/getListByQuarterName/{quarter}/{name}")
	public List<DowJonesIndex> getDowJonesIndex(@PathVariable("quarter") String quarter, @PathVariable("name") String name) {
		return dowJonesIndexService.getDowJonesIndexList(quarter, name);
	}

}
