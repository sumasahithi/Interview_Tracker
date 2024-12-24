package interview.springboot.interviewTracker.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "interview_data")
public class InterviewData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "interview_date_time")
    private LocalDateTime interview_date_time;

    @Column(name = "interviewer_name")
    private String interviewer_name;

    @Column(name = "interview_for_position")
    private String interview_for_position;

    @Column(name = "employee_name")
    private String employee_name;

    @Column(name = "feedback")
    private String feedback;

    @Column(name = "interview_recording_link")
    private String interview_recording_link;

    @Column(name = "final_judgement")
    private String final_judgement;

    @Column(name = "interview_pan_card_number")
    private String interview_pan_card_number;

    public InterviewData() {
    }

    public InterviewData(long id, LocalDateTime interview_date_time, String interviewer_name,
                          String interview_for_position, String employee_name, String feedback,
                         String interview_recording_link, String final_judgement,
                         String interview_pan_card_number) {
                this.id = id;
                this.interview_date_time = interview_date_time;
                this.interviewer_name = interviewer_name;
                this.interview_for_position =  interview_for_position;
                this.employee_name = employee_name;
                this.feedback = feedback;
                this.interview_recording_link = interview_recording_link;
                this.final_judgement = final_judgement;
                this.interview_pan_card_number = interview_pan_card_number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getInterview_date_time() {
        return interview_date_time;
    }

    public void setInterview_date_time(LocalDateTime interview_date_time) {
        this.interview_date_time = interview_date_time;
    }

    public String getInterviewer_name() {
        return interviewer_name;
    }

    public void setInterviewer_name(String interviewer_name) {
        this.interviewer_name = interviewer_name;
    }

    public String getInterview_for_position() {
        return interview_for_position;
    }

    public void setInterview_for_position(String interview_for_position) {
        this.interview_for_position = interview_for_position;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getInterview_recording_link() {
        return interview_recording_link;
    }

    public void setInterview_recording_link(String interview_recording_link) {
        this.interview_recording_link = interview_recording_link;
    }

    public String getFinal_judgement() {
        return final_judgement;
    }

    public void setFinal_judgement(String final_judgement) {
        this.final_judgement = final_judgement;
    }

    public String getInterview_pan_card_number() {
        return interview_pan_card_number;
    }

    public void setInterview_pan_card_number(String interview_pan_card_number) {
        this.interview_pan_card_number = interview_pan_card_number;
    }
}

