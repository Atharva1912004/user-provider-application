package com.bloggios.user.service;

import com.bloggios.user.payload.response.ProfileTagResponse;

import java.util.concurrent.CompletableFuture;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - user-provider-application
 * Package - com.bloggios.user.service
 * Created_on - May 26 - 2024
 * Created_at - 15:51
 */

public interface ProfileAuthService {

    CompletableFuture<ProfileTagResponse> getProfileTags();
}