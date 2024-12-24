package interview.springboot.interviewTracker.service.impl;

import interview.springboot.interviewTracker.model.InterviewData;
import interview.springboot.interviewTracker.reposiroty.InterviewRepository;
import interview.springboot.interviewTracker.service.InterviewService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterviewServiceImpl implements InterviewService {

    private final InterviewRepository interviewRepository;

    public InterviewServiceImpl(InterviewRepository interviewRepository) {
        this.interviewRepository = interviewRepository;
    }

    @Override
    public List<InterviewData> findAllInterviewData() {
        return interviewRepository.findAll();
    }

    @Override
    public Optional<InterviewData> findById(long id) {
        return interviewRepository.findById(id);
    }

    @Override
    public InterviewData saveInterviewData(InterviewData interviewData) {
        return interviewRepository.save(interviewData);
    }

    @Override
    public InterviewData updateInterviewData(InterviewData interviewData) {
        return interviewRepository.save(interviewData);
    }


}
