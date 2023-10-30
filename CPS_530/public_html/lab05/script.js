$(document).ready(function() {
    let isDraggable = false;

    function toggleDraggable() {
        if (isDraggable) {
            $('.part').off('mousedown');
            $('#toggleDrag').text('Enable Dragging');
        } else {
            $('.part').on('mousedown', function(event) {
                let startX = event.pageX - $(this).offset().left;
                let startY = event.pageY - $(this).offset().top;
                let draggedItem = $(this);

                $(document).on('mousemove', function(event) {
                    draggedItem.css({
                        top: event.pageY - startY + 'px',
                        left: event.pageX - startX + 'px'
                    });
                });

                $(document).on('mouseup', function() {
                    $(document).off('mousemove');
                });
            });

            $('#toggleDrag').text('Disable Dragging');
        }

        isDraggable = !isDraggable;
    }

    $('#toggleDrag').on('click', toggleDraggable);

    $('#saveBtn').on('click', function() {
        html2canvas(document.querySelector("#potatoHead"), {
            useCORS: true
        }).then(canvas => {
            let link = document.createElement('a');
            link.href = canvas.toDataURL('image/jpeg', 1.0);
            link.download = 'potato_head.jpg';
            link.click();
        });
    });    
});
