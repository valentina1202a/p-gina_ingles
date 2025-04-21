// Función para desplazarse suavemente a la sección seleccionada
function scrollToSection(sectionId) {
    const section = document.getElementById(sectionId);
    if (section) {
        section.scrollIntoView({ behavior: 'smooth' });
    }
}

// Manejo de la navegación entre secciones
document.querySelectorAll('nav button').forEach(button => {
    button.addEventListener('click', function() {
        // Ocultar todas las secciones
        document.querySelectorAll('.section').forEach(section => {
            section.style.display = 'none';
        });
        // Mostrar la sección seleccionada
        const targetSection = document.getElementById(this.getAttribute('onclick').match(/'([^']+)'/)[1]);
        if (targetSection) {
            targetSection.style.display = 'block';
        }
    });
});