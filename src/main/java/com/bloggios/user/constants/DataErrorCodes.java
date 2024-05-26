package com.bloggios.user.constants;

import lombok.experimental.UtilityClass;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - user-provider-application
 * Package - com.bloggios.user.constants
 * Created_on - May 22 - 2024
 * Created_at - 16:50
 */

@UtilityClass
public class DataErrorCodes {
    public static final String INVALID_UUID = "DE__USER-2001";
    public static final String INVALID_PROFILE_TAG_VALUE = "DE__USER-2002";
    public static final String NAME_MANDATORY = "DE__USER-2003";
    public static final String NAME_LENGTH_EXCEEDED = "DE__USER-2004";
    public static final String NAME_INVALID = "DE__USER-2005";
    public static final String BIO_LIMIT_EXCEED = "DE__USER-2006";
    public static final String BIO_WORD_LIMIT_EXCEED = "DE__USER-2007";
    public static final String BIO_LINE_LIMIT_EXCEED = "DE__USER-2008";
    public static final String UNSECURED_PROTOCOL = "DE__USER-2009";
    public static final String LINK_PROTOCOL_NOT_PRESENT = "DE__USER-2010";
    public static final String PROFILE_ALREADY_PRESENT = "DE__USER-2011";
}