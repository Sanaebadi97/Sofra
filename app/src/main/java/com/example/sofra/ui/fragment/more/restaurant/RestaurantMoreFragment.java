package com.example.sofra.ui.fragment.more.restaurant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.sofra.R;
import com.example.sofra.databinding.FragmentRestaurantMoreBinding;
import com.example.sofra.ui.fragment.BaseFragment;
import com.example.sofra.ui.fragment.more.restaurant.offers.RestaurantOfferListFragment;
import com.example.sofra.utils.HelperMethod;

import java.util.Objects;

public class RestaurantMoreFragment extends BaseFragment {
    private FragmentRestaurantMoreBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRestaurantMoreBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        setUpActivity();

        binding.restaurantMoreFragmentTextViewMyOffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HelperMethod.replaceFragment(getParentFragmentManager()
                        , R.id.home_activity_fragmentContainerView, new RestaurantOfferListFragment()
                        , Objects.requireNonNull(getActivity()).getClass().getName(), null);
            }
        });

        binding.restaurantMoreFragmentTextViewContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.restaurantMoreFragmentTextViewAboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.restaurantMoreFragmentTextViewCommentsAndRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.restaurantMoreFragmentTextViewChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.restaurantMoreFragmentTextViewLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }
}