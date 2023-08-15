package com.mytaskapplication.model.SocialResponse;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("google_id")
	private String googleId;

	@SerializedName("tot_due")
	private String totDue;

	@SerializedName("tot_review")
	private int totReview;

	@SerializedName("tot_earning")
	private String totEarning;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("profile_headline")
	private String profileHeadline;

	@SerializedName("profile_description")
	private String profileDescription;

	@SerializedName("tot_commission")
	private String totCommission;

	@SerializedName("vcode")
	private String vcode;

	@SerializedName("temp_email")
	private String tempEmail;

	@SerializedName("platform")
	private String platform;

	@SerializedName("url_slug")
	private String urlSlug;

	@SerializedName("password")
	private String password;

	@SerializedName("temp_vcode")
	private String tempVcode;

	@SerializedName("avg_review")
	private String avgReview;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("signup_from")
	private String signupFrom;

	@SerializedName("id")
	private int id;

	@SerializedName("cover_image")
	private String coverImage;

	@SerializedName("remember_token")
	private String rememberToken;

	@SerializedName("email")
	private String email;

	@SerializedName("slug")
	private String slug;

	@SerializedName("address")
	private String address;

	@SerializedName("company_id")
	private String companyId;

	@SerializedName("join_date")
	private String joinDate;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("profile_pic")
	private String profilePic;

	@SerializedName("email_verified_at")
	private String emailVerifiedAt;

	@SerializedName("tot_withdrawals")
	private String totWithdrawals;

	@SerializedName("avatar")
	private String avatar;

	@SerializedName("is_show")
	private String isShow;

	@SerializedName("facebook_id")
	private String facebookId;

	@SerializedName("admin_approve_vip_member")
	private String adminApproveVipMember;

	@SerializedName("hourly_rate")
	private String hourlyRate;

	@SerializedName("name")
	private String name;

	@SerializedName("vip_member_show")
	private String vipMemberShow;

	@SerializedName("timezone_id")
	private int timezoneId;

	@SerializedName("commission_rate")
	private String commissionRate;

	@SerializedName("status")
	private String status;

	public String getGoogleId(){
		return googleId;
	}

	public String getTotDue(){
		return totDue;
	}

	public int getTotReview(){
		return totReview;
	}

	public String getTotEarning(){
		return totEarning;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getProfileHeadline(){
		return profileHeadline;
	}

	public String getProfileDescription(){
		return profileDescription;
	}

	public String getTotCommission(){
		return totCommission;
	}

	public String getVcode(){
		return vcode;
	}

	public String getTempEmail(){
		return tempEmail;
	}

	public String getPlatform(){
		return platform;
	}

	public String getUrlSlug(){
		return urlSlug;
	}

	public String getPassword(){
		return password;
	}

	public String getTempVcode(){
		return tempVcode;
	}

	public String getAvgReview(){
		return avgReview;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getSignupFrom(){
		return signupFrom;
	}

	public int getId(){
		return id;
	}

	public String getCoverImage(){
		return coverImage;
	}

	public String getRememberToken(){
		return rememberToken;
	}

	public String getEmail(){
		return email;
	}

	public String getSlug(){
		return slug;
	}

	public String getAddress(){
		return address;
	}

	public String getCompanyId(){
		return companyId;
	}

	public String getJoinDate(){
		return joinDate;
	}

	public String getMobile(){
		return mobile;
	}

	public String getProfilePic(){
		return profilePic;
	}

	public String getEmailVerifiedAt(){
		return emailVerifiedAt;
	}

	public String getTotWithdrawals(){
		return totWithdrawals;
	}

	public String getAvatar(){
		return avatar;
	}

	public String getIsShow(){
		return isShow;
	}

	public String getFacebookId(){
		return facebookId;
	}

	public String getAdminApproveVipMember(){
		return adminApproveVipMember;
	}

	public String getHourlyRate(){
		return hourlyRate;
	}

	public String getName(){
		return name;
	}

	public String getVipMemberShow(){
		return vipMemberShow;
	}

	public int getTimezoneId(){
		return timezoneId;
	}

	public String getCommissionRate(){
		return commissionRate;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"google_id = '" + googleId + '\'' + 
			",tot_due = '" + totDue + '\'' + 
			",tot_review = '" + totReview + '\'' + 
			",tot_earning = '" + totEarning + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",profile_headline = '" + profileHeadline + '\'' + 
			",profile_description = '" + profileDescription + '\'' + 
			",tot_commission = '" + totCommission + '\'' + 
			",vcode = '" + vcode + '\'' + 
			",temp_email = '" + tempEmail + '\'' + 
			",platform = '" + platform + '\'' + 
			",url_slug = '" + urlSlug + '\'' + 
			",password = '" + password + '\'' + 
			",temp_vcode = '" + tempVcode + '\'' + 
			",avg_review = '" + avgReview + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",signup_from = '" + signupFrom + '\'' + 
			",id = '" + id + '\'' + 
			",cover_image = '" + coverImage + '\'' + 
			",remember_token = '" + rememberToken + '\'' + 
			",email = '" + email + '\'' + 
			",slug = '" + slug + '\'' + 
			",address = '" + address + '\'' + 
			",company_id = '" + companyId + '\'' + 
			",join_date = '" + joinDate + '\'' + 
			",mobile = '" + mobile + '\'' + 
			",profile_pic = '" + profilePic + '\'' + 
			",email_verified_at = '" + emailVerifiedAt + '\'' + 
			",tot_withdrawals = '" + totWithdrawals + '\'' + 
			",avatar = '" + avatar + '\'' + 
			",is_show = '" + isShow + '\'' + 
			",facebook_id = '" + facebookId + '\'' + 
			",admin_approve_vip_member = '" + adminApproveVipMember + '\'' + 
			",hourly_rate = '" + hourlyRate + '\'' + 
			",name = '" + name + '\'' + 
			",vip_member_show = '" + vipMemberShow + '\'' + 
			",timezone_id = '" + timezoneId + '\'' + 
			",commission_rate = '" + commissionRate + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}