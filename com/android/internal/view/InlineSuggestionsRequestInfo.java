/*
 * Copyright (C) 2020 The Android Open Source Project
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

package com.android.internal.view;

import android.annotation.NonNull;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import android.view.inputmethod.InlineSuggestionsRequest;

import com.android.internal.util.DataClass;

/**
 * Wraps the information needed to create an {@link InlineSuggestionsRequest}.
 *
 * @hide
 */
@DataClass(
        genToString = true,
        genHiddenConstDefs = true,
        genEqualsHashCode = true)
public final class InlineSuggestionsRequestInfo implements Parcelable {
    /**
     * The {@link ComponentName} of current app/activity
     */
    private final @NonNull ComponentName mComponentName;

    /**
     * The {@link AutofillId} of currently focused field.
     */
    private final @NonNull AutofillId mAutofillId;

    /**
     * The extras that contain the UI renderer related information
     */
    private final @NonNull Bundle mUiExtras;



    // Code below generated by codegen v1.0.14.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/core/java/com/android/internal/view/InlineSuggestionsRequestInfo.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    /**
     * Creates a new InlineSuggestionsRequestInfo.
     *
     * @param componentName
     *   The {@link ComponentName} of current app/activity
     * @param autofillId
     *   The {@link AutofillId} of currently focused field.
     * @param uiExtras
     *   The extras that contain the ui renderer related information
     */
    @DataClass.Generated.Member
    public InlineSuggestionsRequestInfo(
            @NonNull ComponentName componentName,
            @NonNull AutofillId autofillId,
            @NonNull Bundle uiExtras) {
        this.mComponentName = componentName;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mComponentName);
        this.mAutofillId = autofillId;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mAutofillId);
        this.mUiExtras = uiExtras;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mUiExtras);

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * The {@link ComponentName} of current app/activity
     */
    @DataClass.Generated.Member
    public @NonNull ComponentName getComponentName() {
        return mComponentName;
    }

    /**
     * The {@link AutofillId} of currently focused field.
     */
    @DataClass.Generated.Member
    public @NonNull AutofillId getAutofillId() {
        return mAutofillId;
    }

    /**
     * The extras that contain the ui renderer related information
     */
    @DataClass.Generated.Member
    public @NonNull Bundle getUiExtras() {
        return mUiExtras;
    }

    @Override
    @DataClass.Generated.Member
    public String toString() {
        // You can override field toString logic by defining methods like:
        // String fieldNameToString() { ... }

        return "InlineSuggestionsRequestInfo { " +
                "componentName = " + mComponentName + ", " +
                "autofillId = " + mAutofillId + ", " +
                "uiExtras = " + mUiExtras +
        " }";
    }

    @Override
    @DataClass.Generated.Member
    public boolean equals(@android.annotation.Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(InlineSuggestionsRequestInfo other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        InlineSuggestionsRequestInfo that = (InlineSuggestionsRequestInfo) o;
        //noinspection PointlessBooleanExpression
        return true
                && java.util.Objects.equals(mComponentName, that.mComponentName)
                && java.util.Objects.equals(mAutofillId, that.mAutofillId)
                && java.util.Objects.equals(mUiExtras, that.mUiExtras);
    }

    @Override
    @DataClass.Generated.Member
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + java.util.Objects.hashCode(mComponentName);
        _hash = 31 * _hash + java.util.Objects.hashCode(mAutofillId);
        _hash = 31 * _hash + java.util.Objects.hashCode(mUiExtras);
        return _hash;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull android.os.Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        dest.writeTypedObject(mComponentName, flags);
        dest.writeTypedObject(mAutofillId, flags);
        dest.writeBundle(mUiExtras);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ InlineSuggestionsRequestInfo(@NonNull android.os.Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        ComponentName componentName = (ComponentName) in.readTypedObject(ComponentName.CREATOR);
        AutofillId autofillId = (AutofillId) in.readTypedObject(AutofillId.CREATOR);
        Bundle uiExtras = in.readBundle();

        this.mComponentName = componentName;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mComponentName);
        this.mAutofillId = autofillId;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mAutofillId);
        this.mUiExtras = uiExtras;
        com.android.internal.util.AnnotationValidations.validate(
                NonNull.class, null, mUiExtras);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<InlineSuggestionsRequestInfo> CREATOR
            = new Parcelable.Creator<InlineSuggestionsRequestInfo>() {
        @Override
        public InlineSuggestionsRequestInfo[] newArray(int size) {
            return new InlineSuggestionsRequestInfo[size];
        }

        @Override
        public InlineSuggestionsRequestInfo createFromParcel(@NonNull android.os.Parcel in) {
            return new InlineSuggestionsRequestInfo(in);
        }
    };

    @DataClass.Generated(
            time = 1582076613213L,
            codegenVersion = "1.0.14",
            sourceFile = "frameworks/base/core/java/com/android/internal/view/InlineSuggestionsRequestInfo.java",
            inputSignatures = "private final @android.annotation.NonNull android.content.ComponentName mComponentName\nprivate final @android.annotation.NonNull android.view.autofill.AutofillId mAutofillId\nprivate final @android.annotation.NonNull android.os.Bundle mUiExtras\nclass InlineSuggestionsRequestInfo extends java.lang.Object implements [android.os.Parcelable]\n@com.android.internal.util.DataClass(genToString=true, genHiddenConstDefs=true, genEqualsHashCode=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}