package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tasks")

public class Task {
    @Id
    @Column (name="ID")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column (name="content", length=255, nullable = false)
    private String content;

    @Column (name = "created_at", nullable = false)
    private Timestamp created_at;

    @Column (name = "updated_at", nullable = false)
    private Timestamp updated_at;

    //getter / setter

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

}
