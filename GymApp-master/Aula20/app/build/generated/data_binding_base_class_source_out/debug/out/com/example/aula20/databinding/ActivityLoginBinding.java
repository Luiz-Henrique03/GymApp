// Generated by view binder compiler. Do not edit!
package com.example.aula20.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aula20.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnArrumeSe;

  @NonNull
  public final EditText edtNome;

  @NonNull
  public final EditText edtSenha;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull Button btnArrumeSe,
      @NonNull EditText edtNome, @NonNull EditText edtSenha) {
    this.rootView = rootView;
    this.btnArrumeSe = btnArrumeSe;
    this.edtNome = edtNome;
    this.edtSenha = edtSenha;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnArrumeSe;
      Button btnArrumeSe = ViewBindings.findChildViewById(rootView, id);
      if (btnArrumeSe == null) {
        break missingId;
      }

      id = R.id.edtNome;
      EditText edtNome = ViewBindings.findChildViewById(rootView, id);
      if (edtNome == null) {
        break missingId;
      }

      id = R.id.edtSenha;
      EditText edtSenha = ViewBindings.findChildViewById(rootView, id);
      if (edtSenha == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, btnArrumeSe, edtNome, edtSenha);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
