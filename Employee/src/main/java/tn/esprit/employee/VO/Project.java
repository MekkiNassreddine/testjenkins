package tn.esprit.employee.VO;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
import java.util.Date;

enum Status {
    DONE,DOING,TODO
}

public class Project {

    private int id;

    private String name;

    private String type;


    private Status status;

    private String descreption;

    private Date startDate;


    private Date endDate;


    private int duration;
}
