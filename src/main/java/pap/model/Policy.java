package pap.model;

public class Policy {

	private int id;
	private String policyset, policy, resource, action_type, apply, role, rule, condition;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the policyset
	 */
	public String getPolicyset() {
		return policyset;
	}

	/**
	 * @param policyset the policyset to set
	 */
	public void setPolicyset(String policyset) {
		this.policyset = policyset;
	}

	/**
	 * @return the policy
	 */
	public String getPolicy() {
		return policy;
	}

	/**
	 * @param policy the policy to set
	 */
	public void setPolicy(String policy) {
		this.policy = policy;
	}

	/**
	 * @return the resource
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
	 */
	public void setResource(String resource) {
		this.resource = resource;
	}

	/**
	 * @return the action_type
	 */
	public String getAction_type() {
		return action_type;
	}

	/**
	 * @param action_type the action_type to set
	 */
	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}

	/**
	 * @return the apply
	 */
	public String getApply() {
		return apply;
	}

	/**
	 * @param apply the apply to set
	 */
	public void setApply(String apply) {
		this.apply = apply;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the rule
	 */
	public String getRule() {
		return rule;
	}

	/**
	 * @param rule the rule to set
	 */
	public void setRule(String rule) {
		this.rule = rule;
	}

	/**
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}
}
