package com.dev.delta.uprecruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.uprecruit.entities.ApplyJob;
import com.dev.delta.uprecruit.entities.Candidate;
import com.dev.delta.uprecruit.entities.StaffRecruit;
import com.dev.delta.uprecruit.services.ApplyJobService;
import com.dev.delta.uprecruit.services.CandidateService;
import com.dev.delta.uprecruit.services.CategoryRecruitService;
import com.dev.delta.uprecruit.services.InterviewService;
import com.dev.delta.uprecruit.services.JobService;
import com.dev.delta.uprecruit.services.SkillService;
import com.dev.delta.uprecruit.services.StaffRecruitService;

@Service
public class UpRecruit implements IUpRecruit {

	@Autowired
	ApplyJobService applyJobService;
	
	@Autowired
	CandidateService candidateService;
	
	@Autowired
	CategoryRecruitService categoryService;
	
	@Autowired
	InterviewService interviewService;
	
	@Autowired
	JobService jobService;
	
	@Autowired
	SkillService  skillService;
	
	@Autowired
	StaffRecruitService staffService;
	
	@Autowired
	
	
	
	@Override
	public void initApplyJob() {
		applyJobService.saveOrUpdate(new ApplyJob(null, null, null, null));
		
	}

	@Override
	public void initCandidates() {
		candidateService.saveOrUpdate(new Candidate(null));
		
	}

	@Override
	public void initCategories() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initInterviews() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initJobs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSkills() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initStaffs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTasks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		
	}

}
