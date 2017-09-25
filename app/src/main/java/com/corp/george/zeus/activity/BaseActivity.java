package com.corp.george.zeus.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.MenuItem;

import butterknife.ButterKnife;

/**
 * Created by George on 24.09.2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

	abstract int getLayoutResId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		getWindow().setEnterTransition(new Explode());
		getWindow().setExitTransition(new Explode());
		setContentView(getLayoutResId());
		ButterKnife.bind(this);
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				supportFinishAfterTransition();
				return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed()
	{
		supportFinishAfterTransition();
	}
}
