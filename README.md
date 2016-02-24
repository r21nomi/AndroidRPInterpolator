# AndroidRPInterpolator
AndroidRPInterpolator is the interpolator library using [Rovert Penner's Easing Functions](http://robertpenner.com/easing/).

## Usage
```
ObjectAnimator animator = ObjectAnimator.ofFloat(mTargetView, "translationX", 0, 300);
animator.setInterpolator(new RPInterpolator(RPInterpolator.Easing.SINE_IN_OUT));
animator.start();
```
