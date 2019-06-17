package com.ebookfrenzy.viewmodeldemo.ui.main;








import static com.ebookfrenzy.viewmodeldemo.BR.myViewModel;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ebookfrenzy.viewmodeldemo.R;
import com.ebookfrenzy.viewmodeldemo.databinding.MainFragmentBinding;



public class MainFragment extends Fragment {

  private MainViewModel mViewModel;

  public MainFragmentBinding binding;


  public static MainFragment newInstance() {
    return new MainFragment();
  }

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    binding= DataBindingUtil.inflate(
        inflater, R.layout.main_fragment, container, false);

    binding.setLifecycleOwner(this);
    return binding.getRoot();
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
    binding.setVariable(myViewModel, mViewModel);



  }

}
