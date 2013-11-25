package com.lbk003.camera3reflection;

import com.example.camera3demo.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Camera3Reflection extends Activity {
	private TextView mMessage;
	private Button mBtn;
	private static final String TAG = "Camera3Demo";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera3_demo);
		mMessage = (TextView)findViewById(R.id.message);
		mBtn = (Button)findViewById(R.id.classinfo);
		mBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mMessage.append(getResult());
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.camera3_demo, menu);
		return true;
	}

	private String getResult(){
		StringBuffer sbuf = new StringBuffer();
		String sClasses[][]= { 
				{"CameraManager", "android.hardware.camera2.CameraManager"},
				{"CameraManager.AvailabilityListener", "android.hardware.camera2.CameraManager$AvailabilityListener"},
				{"CameraDevice",  "android.hardware.camera2.CameraDevice"},
				{"CameraDevice.CaptureListener",  "android.hardware.camera2.CameraDevice$CaptureListener"},
				{"CameraDevice.StateListener",  "android.hardware.camera2.CameraDevice$StateListener"},
				{"CameraCharacteristics",  "android.hardware.camera2.CameraCharacteristics"},
				{"CameraMetadata",  "android.hardware.camera2.CameraMetadata"},
				{"CameraMetadata.Key",  "android.hardware.camera2.CameraMetadata$Key"},
				{"CaptureResult",  "android.hardware.camera2.CaptureResult"},
				{"CaptureRequest",  "android.hardware.camera2.CaptureRequest"},
				{"CaptureRequest.Builder",  "android.hardware.camera2.CaptureRequest$Builder"},
				{"CameraFailure",  "android.hardware.camera2.CaptureFailure"},
				{"CameraAccessException","android.hardware.camera2.CameraAccessException"},							  
		};
		
		for (int i=0; i<sClasses.length; i++) {
			sbuf.append("\n");
			sbuf.append(sClasses[i][0]);
			try {  
			    Class.forName(sClasses[i][1]);  
			    sbuf.append(getResources().getString(R.string.found));  
			} catch (ClassNotFoundException e) {  
			    sbuf.append(getResources().getString(R.string.not_found));
			} catch (Exception e) {  
				sbuf.append(getResources().getString(R.string.not_found));
			} 
		}
		sbuf.trimToSize();
		Log.d(TAG, sbuf.toString());
		return sbuf.toString();
	}
}
