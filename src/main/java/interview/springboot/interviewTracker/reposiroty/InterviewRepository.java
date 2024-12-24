package interview.springboot.interviewTracker.reposiroty;

import interview.springboot.interviewTracker.model.InterviewData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<InterviewData, Long> {
}
