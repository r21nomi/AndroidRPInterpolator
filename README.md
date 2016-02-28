# AndroidRPInterpolator
AndroidRPInterpolator is the interpolator library using [Rovert Penner's Easing Functions](http://robertpenner.com/easing/).

![easing.gif](art/easing.gif)

## Getting Started
```groovy
dependencies {
  compile 'com.github.r21nomi:androidrpinterpolator:0.1.0'
}
```

## Usage
```java
ObjectAnimator animator = ObjectAnimator.ofFloat(mTargetView, "translationX", 0, 300);
animator.setInterpolator(new RPInterpolator(RPInterpolator.Easing.SINE_IN_OUT));
animator.start();
```

## License
```
Copyright 2016 Ryota Niinomi (r21nomi)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
