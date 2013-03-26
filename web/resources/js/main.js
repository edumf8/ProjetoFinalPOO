$(function() {
    $('.menu').on('mouseenter', function() {
        $('.submenu', this).stop(true).fadeIn();
        var interval = $(this).data('interval');
        if (typeof interval !== 'undefined') {
            clearInterval(interval);
        }
    });
    $('.menu').on('mouseleave', function() {
        var interval = setInterval(function() {
            $('.submenu', this).stop(true).fadeOut();
        }, 1000);
        $(this).data('interval', interval);
    });
});