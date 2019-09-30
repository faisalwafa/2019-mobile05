package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupsFragment;

public class FitnessActivity extends AppCompatActivity {

    public static final String PUSHUPS_TAG = "PUSHUPS_FRAGMENT";
    public static final String DIPS_TAG = "DIPS_FRAGMENT";
    public static final String HANDSTAND_TAG = "HANDSTAND_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
    }

    public void handleClickPushupsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fitness_fragment_placeholder);
        if (fragment == null || fragment instanceof DipsFragment || fragment instanceof HandstandFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .replace(R.id.fitness_fragment_placeholder,new PushupsFragment(),PUSHUPS_TAG)
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void handleClickDipsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fitness_fragment_placeholder);
        if (fragment == null || fragment instanceof PushupsFragment || fragment instanceof HandstandFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .replace(R.id.fitness_fragment_placeholder,new DipsFragment(),DIPS_TAG)
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void handlerClickHandstandFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fitness_fragment_placeholder);
        if (fragment == null || fragment instanceof PushupsFragment || fragment instanceof DipsFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right)
                    .replace(R.id.fitness_fragment_placeholder,new HandstandFragment(),HANDSTAND_TAG)
                    .addToBackStack(null)
                    .commit();
        }
    }
}
