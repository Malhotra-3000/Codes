const character = document.getElementById('character');
const sword = document.getElementById('sword');
let swordSwinging = false;
let characterPosition = 50; // Initial position (50% of the viewport width)

document.addEventListener('keydown', function(event) {
    if (event.code === 'ArrowLeft' && characterPosition > 0) {
        characterPosition -= 5;
        character.style.left = characterPosition + 'vw';
        character.classList.add('moving-left');
        setTimeout(() => character.classList.remove('moving-left'), 100);
    } else if (event.code === 'ArrowRight' && characterPosition < 95) {
        characterPosition += 5;
        character.style.left = characterPosition + 'vw';
        character.classList.add('moving-right');
        setTimeout(() => character.classList.remove('moving-right'), 100);
    } else if (event.code === 'Space' && !swordSwinging) {
        swordSwinging = true;
        sword.style.transform = 'rotate(-90deg)';
        setTimeout(() => {
            sword.style.transform = 'rotate(0deg)';
            swordSwinging = false;
        }, 200);
    }
});
