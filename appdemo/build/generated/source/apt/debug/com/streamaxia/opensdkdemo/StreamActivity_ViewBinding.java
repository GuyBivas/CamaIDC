// Generated code from Butter Knife. Do not modify!
package com.streamaxia.opensdkdemo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.streamaxia.android.CameraPreview;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StreamActivity_ViewBinding implements Unbinder {
  private StreamActivity target;

  private View view2131165327;

  @UiThread
  public StreamActivity_ViewBinding(StreamActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StreamActivity_ViewBinding(final StreamActivity target, View source) {
    this.target = target;

    View view;
    target.mCameraView = Utils.findRequiredViewAsType(source, R.id.preview, "field 'mCameraView'", CameraPreview.class);
    target.mChronometer = Utils.findRequiredViewAsType(source, R.id.chronometer, "field 'mChronometer'", Chronometer.class);
    view = Utils.findRequiredView(source, R.id.start_stop, "field 'startStopTextView' and method 'startStopStream'");
    target.startStopTextView = Utils.castView(view, R.id.start_stop, "field 'startStopTextView'", TextView.class);
    view2131165327 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startStopStream();
      }
    });
    target.stateTextView = Utils.findRequiredViewAsType(source, R.id.state_text, "field 'stateTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StreamActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCameraView = null;
    target.mChronometer = null;
    target.startStopTextView = null;
    target.stateTextView = null;

    view2131165327.setOnClickListener(null);
    view2131165327 = null;
  }
}
