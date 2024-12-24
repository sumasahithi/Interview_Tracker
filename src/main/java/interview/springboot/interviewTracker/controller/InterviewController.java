package interview.springboot.interviewTracker.controller;

import interview.springboot.interviewTracker.model.InterviewData;
import interview.springboot.interviewTracker.service.InterviewService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/interviewtracker")
public class InterviewController {

    private final InterviewService interviewService;

    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @GetMapping
    public List<InterviewData> findAllInterviewData() {
        return interviewService.findAllInterviewData();
    }

    @GetMapping("/{id}")
    public Optional<InterviewData> findInterviewById(@PathVariable("id") long id) {
       return interviewService.findById(id);
    }

    @PostMapping
    public InterviewData saveInterviewData(@RequestBody InterviewData interviewData) {
        return interviewService.saveInterviewData(interviewData);
    }

    @PutMapping
    public InterviewData updateInterviewData(@RequestBody InterviewData interviewData) {
        return interviewService.updateInterviewData(interviewData);
    }
}

