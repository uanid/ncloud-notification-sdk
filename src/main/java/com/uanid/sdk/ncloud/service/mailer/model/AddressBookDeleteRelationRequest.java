/*
 * api
 * Cloud Outbound Mailer API<br/>https://mail.test-apigw.ntruss.com/api/v1
 *
 * OpenAPI spec version: 2019-06-20T02:51:35Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.uanid.sdk.ncloud.service.mailer.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * AddressBookDeleteRelationRequest
 */
public class AddressBookDeleteRelationRequest {
	private String groupName = null;

	private List<String> emailAddresses = new ArrayList<String>();

	public AddressBookDeleteRelationRequest groupName(String groupName) {
		this.groupName = groupName;
		return this;
	}

	 /**
	 * 수신자 그룹명
	 * @return groupName
	**/
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public AddressBookDeleteRelationRequest emailAddresses(List<String> emailAddresses) {
		this.emailAddresses = emailAddresses;
		return this;
	}

	public AddressBookDeleteRelationRequest addEmailAddressesItem(String emailAddressesItem) {
		this.emailAddresses.add(emailAddressesItem);
		return this;
	}

	 /**
	 * Get emailAddresses
	 * @return emailAddresses
	**/
	public List<String> getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(List<String> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddressBookDeleteRelationRequest addressBookDeleteRelationRequest = (AddressBookDeleteRelationRequest) o;
		return Objects.equals(this.groupName, addressBookDeleteRelationRequest.groupName) &&
				Objects.equals(this.emailAddresses, addressBookDeleteRelationRequest.emailAddresses);
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName, emailAddresses);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddressBookDeleteRelationRequest {\n");
		
		sb.append("		groupName: ").append(toIndentedString(groupName)).append("\n");
		sb.append("		emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}
