module.exports =
  play: (cb) ->
    @_execute "play", cb

  togglepause: (cb) ->
    @_execute "togglepause", cb

  pause: (cb) ->
    @_execute "pause", cb

  stop: (cb) ->
    @_execute "stop", cb

  previous: (cb) ->
    @_execute "previous", cb

  next: (cb) ->
    @_execute "next", cb

  _execute: (mcCmd, callback) ->
    cordova.exec (cb) ->
      callback(null, cb) if callback

    , (err) ->
      callback err

    , "MusicControl", mcCmd, []
