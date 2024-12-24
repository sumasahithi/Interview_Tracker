package interview.springboot.interviewTracker.service;

import interview.springboot.interviewTracker.model.InterviewData;

import java.util.List;
import java.util.Optional;

public interface InterviewService {
    List<InterviewData> findAllInterviewData();
    Optional<InterviewData> findById(long id);

    InterviewData saveInterviewData(InterviewData interviewData);

    InterviewData updateInterviewData(InterviewData interviewData);


}
