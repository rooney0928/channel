package com.qunadai.channel.content.ui;

import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.qunadai.channel.R;
import com.qunadai.channel.content.adapter.MainFragmentPagerAdapter;
import com.qunadai.channel.content.base.BaseActivity;
import com.qunadai.channel.content.ui.home.frag.HomeFragment;
import com.qunadai.channel.content.ui.me.frag.MeFragment;
import com.qunadai.channel.content.view.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.vp_main)
    NoScrollViewPager vp_main;

    @BindView(R.id.rg_nav_group)
    RadioGroup rg_nav_group;
    @BindView(R.id.rb_nav_home)
    RadioButton rb_nav_home;
    @BindView(R.id.rb_nav_me)
    RadioButton rb_nav_me;
    private Handler handler = new Handler();

    private HomeFragment homeFragment;
    private MeFragment meFragment;

    private List<Fragment> fragments = new ArrayList<>();


    @Override
    protected void updateTopViewHideAndShow() {

    }

    @Override
    protected View createCenterView() {
        View content = View.inflate(this, R.layout.activity_main, null);
        return content;
    }

    @Override
    protected View createBottomView() {
        View footer = View.inflate(this, R.layout.layout_nav, null);
        return footer;
    }

    @Override
    protected void initView() {
        homeFragment = HomeFragment.getInstance();
        meFragment = MeFragment.getInstance();

        fragments.add(homeFragment);
        fragments.add(meFragment);
    }

    @Override
    public void initViewData() {
        setTitleText(getResources().getString(R.string.app_name));
        setBackVisible(false);

        vp_main.setAdapter(new MainFragmentPagerAdapter(getSupportFragmentManager(), fragments));

        rg_nav_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.rb_nav_home:
                        vp_main.setCurrentItem(0);

                        break;
                    case R.id.rb_nav_me:
                        vp_main.setCurrentItem(1);

                        break;
                }
            }
        });
        vp_main.setOffscreenPageLimit(2);
        rb_nav_home.setChecked(true);

    }

}
