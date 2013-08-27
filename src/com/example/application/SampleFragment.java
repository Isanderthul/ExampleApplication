
package com.example.application;

import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.TextView;
import android.widget.Toast;

import com.example.application.rest.RestClient;
import com.example.application.rest.RestClient_;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EFragment;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.rest.RestService;

@EFragment(R.layout.fragment_sample)
public class SampleFragment
    extends Fragment
{
	@RestService
    RestClient restClient;

    @ViewById
    TextView labelText;
    
    @Background
    @Click(R.id.button1)
    void anotherButton() {
    	 //Toast.makeText(getActivity(), "hi", Toast.LENGTH_SHORT).show();
    	 restClient.sendMessage("demo", "demo", "0", "hello_world", "0", "\"HelloAppceptionalWorld\"");
    }
    
    @AfterViews
    void afterViews() {
        Bundle bundle = getArguments();
        String label = bundle.getString("label");
        labelText.setText(label);
    }

}
