package pap.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import pap.model.Policy;

public class PolicyDao {

	JdbcTemplate jdbcTemplate;

	public void setTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Policy policy) {
		String sql = "INSERT INTO `policy_standard`(`policyset`, `policy`, `resource`, `action_type`, `apply`, `role`, `rule`, `condition`) "
				+ "VALUES (" + policy.getPolicyset() + "," + policy.getPolicy() + "," + policy.getResource() + ","
				+ policy.getAction_type() + "," + policy.getApply() + "," + policy.getRole() + "," + policy.getRule()
				+ "," + policy.getCondition() + ")";
		return jdbcTemplate.update(sql);
	}

	public int update(Policy policy) {
		String sql = "UPDATE `policy_standard` "
				+ "SET `policyset`=" + policy.getPolicyset() + ",`policy`=" + policy.getPolicy() + ",`resource`="
				+ policy.getResource() + ",`action_type`=" + policy.getAction_type() + ",`apply`=" + policy.getApply()
				+ ",`role`=" + policy.getRole() + ",`rule`=" + policy.getRule() + ",`condition`="
				+ policy.getCondition() + " WHERE id = policy.getId()";
		return jdbcTemplate.update(sql);
	}

	public List<Policy> getPolicy() {
		return jdbcTemplate.query("SELECT * FROM policy_standard", new RowMapper<Policy>() {
			@Override
			public Policy mapRow(ResultSet resultSet, int row) {
				Policy policy = new Policy();
				return policy;
			}
		});
	}
}
