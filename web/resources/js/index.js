$(function() {
    $('.slider-home').slidesjs({
        width: 800,
        height: 600,
        effect: {
            slide: {
                // Slide effect settings.
                speed: 200
            // [number] Speed in milliseconds of the slide animation.
            },
            fade: {
                speed: 300,
                // [number] Speed in milliseconds of the fade animation.
                crossfade: true
            // [boolean] Cross-fade the transition.
            }
        }
    });
});