package com.Repository;

import com.Entity.Record;

import java.util.ArrayList;
import java.util.List;

public class RecordRepository {

    private List<Record> recordList = new ArrayList<>();

    public void save(Record record) {
        recordList.add(record);
    }

    public void print() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < recordList.size(); i++) {
            sb.append("[" + i + "]")
              .append(recordList.get(i))
              .append(System.lineSeparator());
        }

        System.out.println(sb);
    }
}
