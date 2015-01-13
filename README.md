Android Music Control plugin
====================

A Cordova/Phonegap/SteroidsJS plugin that allows you to use basic controls of the default music player on Android. The commands are based off the [MediaPlaybackService](https://android.googlesource.com/platform/packages/apps/Music/+/master/src/com/android/music/MediaPlaybackService.java) source code.

This plugin is still in development and shouldn't be considered in a production environment.

##Usage

<a name="play" />
### play(err, callback)

Play last track.

__Example:__

```javascript
musicControl.play(function(err, cb) {
  if (err) {
    console.log(err);
  }
  return console.log(cb);
});
```
---------------------------------------

<a name="stop" />
### stop(err, callback)

Stop track.

__Example:__

```javascript
musicControl.stop(function(err, cb) {
  if (err) {
    console.log(err);
  }
  return console.log(cb);
});
```
---------------------------------------

<a name="pause" />
### pause(err, callback)

Pause track.

__Example:__

```javascript
musicControl.pause(function(err, cb) {
  if (err) {
    console.log(err);
  }
  return console.log(cb);
});
```
---------------------------------------

<a name="togglepause" />
### togglepause(err, callback)

Toggle between Paused and Play.

__Example:__

```javascript
musicControl.togglepause(function(err, cb) {
  if (err) {
    console.log(err);
  }
  return console.log(cb);
});
```
---------------------------------------

<a name="previous" />
### previous(err, callback)

Play previous track

__Example:__

```javascript
musicControl.previous(function(err, cb) {
  if (err) {
    console.log(err);
  }
  return console.log(cb);
});
```
---------------------------------------

<a name="next" />
### next(err, callback)

Play next track

__Example:__

```javascript
musicControl.next(function(err, cb) {
  if (err) {
    console.log(err);
  }
  return console.log(cb);
});
```
---------------------------------------
