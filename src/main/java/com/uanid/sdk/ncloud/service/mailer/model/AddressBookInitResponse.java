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

/**
 * AddressBookInitResponse
 */
public class AddressBookInitResponse {
	private Integer deletedAddressCount = null;

	public AddressBookInitResponse deletedAddressCount(Integer deletedAddressCount) {
		this.deletedAddressCount = deletedAddressCount;
		return this;
	}

	 /**
	 * 총 삭제 이메일 주소 개수
	 * @return deletedAddressCount
	**/
	public Integer getDeletedAddressCount() {
		return deletedAddressCount;
	}

	public void setDeletedAddressCount(Integer deletedAddressCount) {
		this.deletedAddressCount = deletedAddressCount;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AddressBookInitResponse addressBookInitResponse = (AddressBookInitResponse) o;
		return Objects.equals(this.deletedAddressCount, addressBookInitResponse.deletedAddressCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deletedAddressCount);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AddressBookInitResponse {\n");
		
		sb.append("		deletedAddressCount: ").append(toIndentedString(deletedAddressCount)).append("\n");
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
