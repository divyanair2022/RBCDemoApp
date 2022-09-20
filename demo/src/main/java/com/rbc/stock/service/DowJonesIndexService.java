/**
 * 
 */
package com.rbc.stock.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.rbc.stock.model.DowJonesIndex;
import com.rbc.stock.model.FileDetail;
import com.rbc.stock.repository.DowJonesIndexRepository;

/**
 * @author divya
 *
 */
@Service("dowJonesIndexService")
public class DowJonesIndexService {

	@Autowired
	private DowJonesIndexRepository dowJonesIndexRepository;

	public String saveDowJonesIndex(FileDetail fileDetail) {

		boolean uploadSuccess = false;

		String fileName = fileDetail.getFilePath().concat("\\").concat(fileDetail.getFilename());
		List<DowJonesIndex> dowJoneslist = new ArrayList<DowJonesIndex>();

		DowJonesIndex dowJonesIndex = null;
		try (BufferedReader buffReader = Files.newBufferedReader(Paths.get(fileName))) {

			dowJonesIndex = new DowJonesIndex();
			// br returns as stream and convert it into a List

			dowJoneslist = buffReader.lines().skip(1).map(mapToItem).collect(Collectors.toList());

			dowJonesIndexRepository.saveAll(dowJoneslist);

		} catch (IOException e) {
			e.printStackTrace();
		}

		dowJoneslist.forEach(System.out::println);

		if (null != dowJoneslist && dowJoneslist.size() > 0) {
			uploadSuccess = true;
		}
		if (uploadSuccess)
			return "Successfully inserted";
		else
			return "Failed to insert";

	}

	private Function<String, DowJonesIndex> mapToItem = (line) -> {

		String[] row = line.split(",");// a CSV has comma separated lines

		DowJonesIndex dowJonesRecord = new DowJonesIndex();
		try {
			dowJonesRecord.setQuarter(row[0]);
			dowJonesRecord.setStock(row[1]);
			dowJonesRecord.setDate(new SimpleDateFormat("MM/dd/yyyy").parse(row[2]));

			dowJonesRecord.setOpen(row[3]);
			dowJonesRecord.setHigh(row[4]);
			dowJonesRecord.setLow(row[5]);
			dowJonesRecord.setClose(row[6]);
			dowJonesRecord.setVolume(row[7]);
			dowJonesRecord.setPercent_change_price(row[8]);
			dowJonesRecord.setPercent_change_volume_over_last_wk(row[9]);
			dowJonesRecord.setPrevious_weeks_volume(row[10]);
			dowJonesRecord.setNext_weeks_open(row[11]);
			dowJonesRecord.setNext_weeks_close(row[12]);
			dowJonesRecord.setPercent_change_next_weeks_price(row[13]);
			dowJonesRecord.setDays_to_next_dividend(row[14]);
			dowJonesRecord.setPercent_return_next_dividend(row[15]);
			dowJonesIndexRepository.save(dowJonesRecord);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dowJonesRecord;
	};


	public DowJonesIndex addNewDowJonesRecord(DowJonesIndex dowJonesIndex) {
		DowJonesIndex dowJonesRecord = new DowJonesIndex();
		try {
			dowJonesRecord.setQuarter(dowJonesIndex.getQuarter());
			dowJonesRecord.setStock(dowJonesIndex.getStock());
			dowJonesRecord.setDate(dowJonesIndex.getDate());

			dowJonesRecord.setOpen(dowJonesIndex.getOpen());
			dowJonesRecord.setHigh(dowJonesIndex.getHigh());
			dowJonesRecord.setLow(dowJonesIndex.getLow());
			dowJonesRecord.setClose(dowJonesIndex.getClose());
			dowJonesRecord.setVolume(dowJonesIndex.getVolume());
			dowJonesRecord.setPercent_change_price(dowJonesIndex.getPercent_change_price());
			dowJonesRecord.setPercent_change_volume_over_last_wk(dowJonesIndex.getPercent_change_volume_over_last_wk());
			dowJonesRecord.setPrevious_weeks_volume(dowJonesIndex.getPrevious_weeks_volume());
			dowJonesRecord.setNext_weeks_open(dowJonesIndex.getNext_weeks_open());
			dowJonesRecord.setNext_weeks_close(dowJonesIndex.getNext_weeks_close());
			dowJonesRecord.setPercent_change_next_weeks_price(dowJonesIndex.getPercent_change_next_weeks_price());
			dowJonesRecord.setDays_to_next_dividend(dowJonesIndex.getDays_to_next_dividend());
			dowJonesRecord.setPercent_return_next_dividend(dowJonesIndex.getPercent_return_next_dividend());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dowJonesIndexRepository.save(dowJonesRecord);
		return dowJonesRecord;
	}

	public List<DowJonesIndex> getDowJonesIndexList(String quarter, String name) {
		DowJonesIndex probe = new DowJonesIndex(quarter, name);

		List<DowJonesIndex> result = dowJonesIndexRepository.findAll(Example.of(probe));

		Iterable<DowJonesIndex> iterable = result::iterator;
		for (DowJonesIndex s : iterable) {
			System.out.println(s.toString());
		}
		return result;
	}

}
