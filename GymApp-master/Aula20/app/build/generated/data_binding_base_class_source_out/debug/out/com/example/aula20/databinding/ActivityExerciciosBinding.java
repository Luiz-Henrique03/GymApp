// Generated by view binder compiler. Do not edit!
package com.example.aula20.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
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
  public final CheckBox exercise1;

  @NonNull
  public final CheckBox exercise2;

  @NonNull
  public final CheckBox exercise3;

  @NonNull
  public final CheckBox exercise4;

  @NonNull
  public final CheckBox exercise5;

  @NonNull
  public final CheckBox exercise6;

  @NonNull
  public final CheckBox exercise7;

  @NonNull
  public final CheckBox exercise8;

  @NonNull
  public final Spinner spinnerDiasSemana;

  @NonNull
  public final TextView textView;

  private ActivityExerciciosBinding(@NonNull LinearLayout rootView, @NonNull Button btnCadastrar,
      @NonNull CheckBox exercise1, @NonNull CheckBox exercise2, @NonNull CheckBox exercise3,
      @NonNull CheckBox exercise4, @NonNull CheckBox exercise5, @NonNull CheckBox exercise6,
      @NonNull CheckBox exercise7, @NonNull CheckBox exercise8, @NonNull Spinner spinnerDiasSemana,
      @NonNull TextView textView) {
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
    this.spinnerDiasSemana = spinnerDiasSemana;
    this.textView = textView;
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
      CheckBox exercise1 = ViewBindings.findChildViewById(rootView, id);
      if (exercise1 == null) {
        break missingId;
      }

      id = R.id.exercise2;
      CheckBox exercise2 = ViewBindings.findChildViewById(rootView, id);
      if (exercise2 == null) {
        break missingId;
      }

      id = R.id.exercise3;
      CheckBox exercise3 = ViewBindings.findChildViewById(rootView, id);
      if (exercise3 == null) {
        break missingId;
      }

      id = R.id.exercise4;
      CheckBox exercise4 = ViewBindings.findChildViewById(rootView, id);
      if (exercise4 == null) {
        break missingId;
      }

      id = R.id.exercise5;
      CheckBox exercise5 = ViewBindings.findChildViewById(rootView, id);
      if (exercise5 == null) {
        break missingId;
      }

      id = R.id.exercise6;
      CheckBox exercise6 = ViewBindings.findChildViewById(rootView, id);
      if (exercise6 == null) {
        break missingId;
      }

      id = R.id.exercise7;
      CheckBox exercise7 = ViewBindings.findChildViewById(rootView, id);
      if (exercise7 == null) {
        break missingId;
      }

      id = R.id.exercise8;
      CheckBox exercise8 = ViewBindings.findChildViewById(rootView, id);
      if (exercise8 == null) {
        break missingId;
      }

      id = R.id.spinnerDiasSemana;
      Spinner spinnerDiasSemana = ViewBindings.findChildViewById(rootView, id);
      if (spinnerDiasSemana == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityExerciciosBinding((LinearLayout) rootView, btnCadastrar, exercise1,
          exercise2, exercise3, exercise4, exercise5, exercise6, exercise7, exercise8,
          spinnerDiasSemana, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
