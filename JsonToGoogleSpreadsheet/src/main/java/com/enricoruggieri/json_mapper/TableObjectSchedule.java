package com.enricoruggieri.json_mapper;

import com.enricoruggieri.json_to_gspreadsheet.TableSchedule;

import java.io.FileNotFoundException;

public class TableObjectSchedule extends TableObject<TableMapSchedule> {

    public TableObjectSchedule() throws FileNotFoundException {
        super(Config.TABLE_NAME_SCHEDULE, TableMapSchedule.class, Config.JSON_SCHEDULE);
    }
}
