// Generated by view binder compiler. Do not edit!
package com.example.wildproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wildproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCameraBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton cameraCaptureButton;

  @NonNull
  public final ImageButton cameraSwitchButton;

  @NonNull
  public final ConstraintLayout clMain;

  @NonNull
  public final ImageButton photoViewButton;

  @NonNull
  public final PreviewView viewFinder;

  private ActivityCameraBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton cameraCaptureButton, @NonNull ImageButton cameraSwitchButton,
      @NonNull ConstraintLayout clMain, @NonNull ImageButton photoViewButton,
      @NonNull PreviewView viewFinder) {
    this.rootView = rootView;
    this.cameraCaptureButton = cameraCaptureButton;
    this.cameraSwitchButton = cameraSwitchButton;
    this.clMain = clMain;
    this.photoViewButton = photoViewButton;
    this.viewFinder = viewFinder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_camera, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCameraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.camera_capture_button;
      ImageButton cameraCaptureButton = ViewBindings.findChildViewById(rootView, id);
      if (cameraCaptureButton == null) {
        break missingId;
      }

      id = R.id.camera_switch_button;
      ImageButton cameraSwitchButton = ViewBindings.findChildViewById(rootView, id);
      if (cameraSwitchButton == null) {
        break missingId;
      }

      ConstraintLayout clMain = (ConstraintLayout) rootView;

      id = R.id.photo_view_button;
      ImageButton photoViewButton = ViewBindings.findChildViewById(rootView, id);
      if (photoViewButton == null) {
        break missingId;
      }

      id = R.id.viewFinder;
      PreviewView viewFinder = ViewBindings.findChildViewById(rootView, id);
      if (viewFinder == null) {
        break missingId;
      }

      return new ActivityCameraBinding((ConstraintLayout) rootView, cameraCaptureButton,
          cameraSwitchButton, clMain, photoViewButton, viewFinder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
