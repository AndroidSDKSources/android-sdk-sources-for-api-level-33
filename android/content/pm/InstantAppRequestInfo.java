/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.content.pm;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.annotation.SystemApi;
import android.content.Intent;
import android.os.Parcelable;
import android.os.UserHandle;

import com.android.internal.util.DataClass;

/**
 * Information exposed to {@link android.app.InstantAppResolverService} to complete
 * an instant application resolution request.
 * @hide
 */
@SystemApi
@DataClass(genParcelable = true, genConstructor = true, genAidl = true, genGetters = true)
public final class InstantAppRequestInfo implements Parcelable {

    /**
     * The sanitized {@link Intent} used for resolution. A sanitized Intent is an intent with
     * potential PII removed from the original intent. Fields removed include extras and the
     * host + path of the data, if defined.
     */
    @NonNull
    private final Intent mIntent;

    /** The hash prefix of the instant app's domain or null if no host is defined. */
    @Nullable
    private final int[] mHostDigestPrefix;

    /** The user requesting the instant application */
    @NonNull
    private final UserHandle mUserHandle;

    /** Whether or not the requesting package was an instant app itself */
    private final boolean mRequesterInstantApp;

    /** A unique identifier */
    @NonNull
    private final String mToken;



    // Code below generated by codegen v1.0.15.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/core/java/android/content/pm/InstantAppRequestInfo.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    /**
     * Creates a new InstantAppRequestInfo.
     *
     * @param intent
     *   The sanitized {@link Intent} used for resolution. A sanitized Intent is an intent with
     *   potential PII removed from the original intent. Fields removed include extras and the
     *   host + path of the data, if defined.
     * @param hostDigestPrefix
     *   The hash prefix of the instant app's domain or null if no host is defined.
     * @param userHandle
     *   The user requesting the instant application
     * @param requesterInstantApp
     *   Whether or not the requesting package was an instant app itself
     * @param token
     *   A unique identifier
     */
    @DataClass.Generated.Member
    public InstantAppRequestInfo(
            @NonNull Intent intent,
            @Nullable int[] hostDigestPrefix,
            @NonNull UserHandle userHandle,
            boolean requesterInstantApp,
            @NonNull String token) {
        this.mIntent = intent;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mIntent);
        this.mHostDigestPrefix = hostDigestPrefix;
        this.mUserHandle = userHandle;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mUserHandle);
        this.mRequesterInstantApp = requesterInstantApp;
        this.mToken = token;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mToken);

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * The sanitized {@link Intent} used for resolution. A sanitized Intent is an intent with
     * potential PII removed from the original intent. Fields removed include extras and the
     * host + path of the data, if defined.
     */
    @DataClass.Generated.Member
    public @NonNull Intent getIntent() {
        return mIntent;
    }

    /**
     * The hash prefix of the instant app's domain or null if no host is defined.
     */
    @DataClass.Generated.Member
    public @Nullable int[] getHostDigestPrefix() {
        return mHostDigestPrefix;
    }

    /**
     * The user requesting the instant application
     */
    @DataClass.Generated.Member
    public @NonNull UserHandle getUserHandle() {
        return mUserHandle;
    }

    /**
     * Whether or not the requesting package was an instant app itself
     */
    @DataClass.Generated.Member
    public boolean isRequesterInstantApp() {
        return mRequesterInstantApp;
    }

    /**
     * A unique identifier
     */
    @DataClass.Generated.Member
    public @NonNull String getToken() {
        return mToken;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull android.os.Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        byte flg = 0;
        if (mRequesterInstantApp) flg |= 0x8;
        if (mHostDigestPrefix != null) flg |= 0x2;
        dest.writeByte(flg);
        dest.writeTypedObject(mIntent, flags);
        if (mHostDigestPrefix != null) dest.writeIntArray(mHostDigestPrefix);
        dest.writeTypedObject(mUserHandle, flags);
        dest.writeString(mToken);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ InstantAppRequestInfo(@NonNull android.os.Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        byte flg = in.readByte();
        boolean requesterInstantApp = (flg & 0x8) != 0;
        Intent intent = (Intent) in.readTypedObject(Intent.CREATOR);
        int[] hostDigestPrefix = (flg & 0x2) == 0 ? null : in.createIntArray();
        UserHandle userHandle = (UserHandle) in.readTypedObject(UserHandle.CREATOR);
        String token = in.readString();

        this.mIntent = intent;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mIntent);
        this.mHostDigestPrefix = hostDigestPrefix;
        this.mUserHandle = userHandle;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mUserHandle);
        this.mRequesterInstantApp = requesterInstantApp;
        this.mToken = token;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mToken);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<InstantAppRequestInfo> CREATOR
            = new Parcelable.Creator<InstantAppRequestInfo>() {
        @Override
        public InstantAppRequestInfo[] newArray(int size) {
            return new InstantAppRequestInfo[size];
        }

        @Override
        public InstantAppRequestInfo createFromParcel(@NonNull android.os.Parcel in) {
            return new InstantAppRequestInfo(in);
        }
    };

    @DataClass.Generated(
            time = 1583964236162L,
            codegenVersion = "1.0.15",
            sourceFile = "frameworks/base/core/java/android/content/pm/InstantAppRequestInfo.java",
            inputSignatures = "private final @android.annotation.NonNull android.content.Intent mIntent\nprivate final @android.annotation.Nullable int[] mHostDigestPrefix\nprivate final @android.annotation.NonNull android.os.UserHandle mUserHandle\nprivate final  boolean mRequesterInstantApp\nprivate final @android.annotation.NonNull java.lang.String mToken\nclass InstantAppRequestInfo extends java.lang.Object implements [android.os.Parcelable]\n@com.android.internal.util.DataClass(genParcelable=true, genConstructor=true, genAidl=true, genGetters=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}