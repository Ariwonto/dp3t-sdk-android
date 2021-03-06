/*
 * Created by Ubique Innovation AG
 * https://www.ubique.ch
 * Copyright (c) 2020. All rights reserved.
 */
package org.dpppt.android.sdk.internal.backend.models;

import java.util.ArrayList;
import java.util.List;

import org.dpppt.android.sdk.backend.models.ApplicationInfo;

public class ApplicationsList {

	private List<ApplicationInfo> applications;

	public ApplicationsList() {
		applications = new ArrayList<>();
	}

	public List<ApplicationInfo> getApplications() {
		return applications;
	}

}
