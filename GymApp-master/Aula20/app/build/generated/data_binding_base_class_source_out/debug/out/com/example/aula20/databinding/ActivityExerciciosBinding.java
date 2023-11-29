// Generated by view binder compiler. Do not edit!
package com.example.aula20.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aula20.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExerciciosBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCadastrar;

  @NonNull
  public final RadioButton exercise1;

  @NonNull
  public final RadioButton exercise2;

  @NonNull
  public final RadioButton exercise3;

  @NonNull
  public final RadioButton exercise4;

  @NonNull
  public final RadioButton exercise5;

  @NonNull
  public final RadioButton exercise6;

  @NonNull
  public final RadioButton exercise7;

  @NonNull
  public final RadioButton exercise8;

  @NonNull
  public final RadioGroup exerciseRadioGroup;

  private ActivityExerciciosBinding(@NonNull LinearLayout rootView, @NonNull Button btnCadastrar,
      @NonNull RadioButton exercise1, @NonNull RadioButton exercise2,
      @NonNull RadioButton exercise3, @NonNull RadioButton exercise4,
      @NonNull RadioButton exercise5, @NonNull RadioButton exercise6,
      @NonNull RadioButton exercise7, @NonNull RadioButton exercise8,
      @NonNull RadioGroup exerciseRadioGroup) {
    this.rootView = rootView;
    this.btnCadastrar = btnCadastrar;
    this.exercise1 = exercise1;
    this.exercise2 = exercise2;
    this.exercise3 = exercise3;
    this.exercise4 = exercise4;
    this.exercise5 = exercise5;
    this.exercise6 = exercise6;
    this.exercise7 = exercise7;
    this.exercise8 = exercise8;
    this.exerciseRadioGroup = exerciseRadioGroup;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExerciciosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExerciciosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_exercicios, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExerciciosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCadastrar;
      Button btnCadastrar = ViewBindings.findChildViewById(rootView, id);
      if (btnCadastrar == null) {
        break missingId;
      }

      id = R.id.exercise1;
      RadioButton exercise1 = ViewBindings.findChildViewById(rootView, id);
      if (exercise1 == null) {
        break missingId;
      }

      id = R.id.exercise2;
      RadioButton exercise2 = ViewBindings.findChildViewById(rootView, id);
      if (exercise2 == null) {
        break missingId;
      }

      id = R.id.exercise3;
      RadioButton exercise3 = ViewBindings.findChildViewById(rootView, id);
      if (exercise3 == null) {
        break missingId;
      }

      id = R.id.exercise4;
      RadioButton exercise4 = ViewBindings.findChildViewById(rootView, id);
      if (exercise4 == null) {
        break missingId;
      }

      id = R.id.exercise5;
      RadioButton exercise5 = ViewBindings.findChildViewById(rootView, id);
      if (exercise5 == null) {
        break missingId;
      }

      id = R.id.exercise6;
      RadioButton exercise6 = ViewBindings.findChildViewById(rootView, id);
      if (exercise6 == null) {
        break missingId;
      }

      id = R.id.exercise7;
      RadioButton exercise7 = ViewBindings.findChildViewById(rootView, id);
      if (exercise7 == null) {
        break missingId;
      }

      id = R.id.exercise8;
      RadioButton exercise8 = ViewBindings.findChildViewById(rootView, id);
      if (exercise8 == null) {
        break missingId;
      }

      id = R.id.exerciseRadioGroup;
      RadioGroup exerciseRadioGroup = ViewBindings.findChildViewById(rootView, id);
      if (exerciseRadioGroup == null) {
        break missingId;
      }

      return new ActivityExerciciosBinding((LinearLayout) rootView, btnCadastrar, exercise1,
          exercise2, exercise3, exercise4, exercise5, exercise6, exercise7, exercise8,
          exerciseRadioGroup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
