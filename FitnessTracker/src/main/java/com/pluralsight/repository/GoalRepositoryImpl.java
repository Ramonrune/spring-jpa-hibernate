package com.pluralsight.repository;
/*
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Goal save(Goal goal) {
		if (goal.getId() == null) {
			entityManager.persist(goal);
			entityManager.flush();

		} else {
			goal = entityManager.merge(goal);
		}

		return goal;
	}

	public List<Goal> findAllGoals() {
		/*
		 * Query query = entityManager.createQuery("select g from Goal g");
		 * 
		 * @SuppressWarnings("unchecked") List<Goal> goals = query.getResultList();
		 */
		/*TypedQuery<Goal> query = entityManager.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);

		return query.getResultList();
	}

	public List<GoalReport> findAllGoalReports() {
		// Query query = entityManager.createQuery("select new
		// com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) from "
		// + "Goal g, Exercise e where g.id = e.goal.id");
		TypedQuery<GoalReport> query = entityManager.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
		return query.getResultList();
	}

}*/
